/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.empresavacante;

import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.Empresa;
import com.ec.entidad.EmpresaPostulante;
import com.ec.entidad.EmpresasParticipantes;
import com.ec.entidad.EmpresasVacante;
import com.ec.entidad.Vacante;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioEmpresasParticipantes;
import com.ec.servicio.ServicioEmpresasPostulante;
import com.ec.servicio.ServicioEmpresasVacante;
import com.ec.servicio.ServicioVacante;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.activation.MimetypesFileTypeMap;
import javax.mail.internet.ParseException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Filedownload;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;

/**
 *
 * @author root
 */
public class AdmEmpresaVacante {

    UserCredential credential = new UserCredential();

    /*BUSCA VACANTES*/
    ServicioEmpresasVacante servicioEmpresasVacante = new ServicioEmpresasVacante();
    ServicioEmpresasParticipantes servicioEmpresasParticipantes = new ServicioEmpresasParticipantes();

    private List<EmpresasParticipantes> listaDatos = new ArrayList<EmpresasParticipantes>();
    private List<EmpresaPostulante> listaPostulantes = new ArrayList<EmpresaPostulante>();
    private ListModelList<EmpresasParticipantes> listaDatosPostulantesModel;
    private Set<EmpresasParticipantes> registrosSeleccionados = new HashSet<EmpresasParticipantes>();
    private String buscar = "";

    /*BUSCA POSTULANTES*/
    ServicioEmpresasVacante servicioEmpresasVacante2 = new ServicioEmpresasVacante();
    private List<EmpresasVacante> listaDatos2 = new ArrayList<EmpresasVacante>();
    private String buscar2 = "";
    /*BUSCA PAIS*/
    ServicioEmpresasVacante servicioEmpresasVacantePais = new ServicioEmpresasVacante();
    private List<EmpresasVacante> listaDatosPais = new ArrayList<EmpresasVacante>();
    private String buscarPais = "";
    private EmpresasVacante paisSelected;
    private Integer numeroRegistros = 0;
    private Date fechainicio = new Date();
    private Date fechaFin = new Date();
    
    ServicioVacante servicioVacante= new ServicioVacante();

    /*buscar postulante*/
    ServicioEmpresasPostulante servicioEmpresasPostulante = new ServicioEmpresasPostulante();

    /*LINKED LIST*/
    public AdmEmpresaVacante() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;
//        buscar();
        getObtenerVacantes();

        buscarPais();
    }
//probar metodo de la vista

    @Command
    @NotifyChange({"numeroRegistros", "listaPostulantes"})
    public void listaPostulantes(@BindingParam("valor") EmpresasVacante valor) {

        listaPostulantes = servicioEmpresasPostulante.findByIdVacante(valor.getIdvacante());
//        for (EmpresaPostulante listaPostulante : listaPostulantes) {
//            System.out.println("VALES OBTENIDOS  id vacante " + valor.getIdvacante() + "  -->" + listaPostulante.getIdUsuario());
//        }
//        numeroRegistros = listaPostulantes.size();
    }

    @Command
    @NotifyChange({"listaDatosPostulantesModel", "buscar"})
    public void listaPostulantesFechas(@BindingParam("valor") EmpresasVacante valor) {
        listaDatos = servicioEmpresasParticipantes.findByLikePorFechas(fechainicio, fechaFin, buscarPais);
        getObtenerVacantes();

    }

    private void buscarPostulantes(Integer idEmpresa) {

        listaDatos2 = servicioEmpresasVacante.findByIdEmpresa(idEmpresa, fechainicio, fechaFin);

    }

    private void buscarPais() {

        listaDatosPais = servicioEmpresasVacante.findByLikePais(buscarPais);

    }

    public List<EmpresasVacante> getListaDatosPais() {
        return listaDatosPais;
    }

    public void setListaDatosPais(List<EmpresasVacante> listaDatosPais) {
        this.listaDatosPais = listaDatosPais;
    }

    public List<EmpresasParticipantes> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<EmpresasParticipantes> listaDatos) {
        this.listaDatos = listaDatos;
    }

    private void getObtenerVacantes() {
        setListaDatosPostulantesModel(new ListModelList<EmpresasParticipantes>(getListaDatos()));
        ((ListModelList<EmpresasParticipantes>) listaDatosPostulantesModel).setMultiple(false);
    }

    @Command
    @NotifyChange({"listaDatos2", "buscar"})
    public void seleccionarRegistros() {
        registrosSeleccionados = ((ListModelList<EmpresasParticipantes>) getListaDatosPostulantesModel()).getSelection();
        if (registrosSeleccionados.size() > 0) {
            for (EmpresasParticipantes registrosSeleccionado : registrosSeleccionados) {
                buscarPostulantes(registrosSeleccionado.getIdusuario());
                break;
            }
        }
    }

    @Command
    @NotifyChange({"listaDatos2", "buscar2"})
    public void seleccionarPostulantes(@BindingParam("valor") EmpresasVacante valor) {

        buscarPostulantes(valor.getIdvacante());
    }
    @Command
    @NotifyChange({"listaDatos2", "buscar2"})
    public void moficarVacante(@BindingParam("valor") EmpresasVacante valor) {

        Vacante vacante = servicioVacante.findById(valor.getIdvacante());
        
        try {
            final HashMap<String, Vacante> map = new HashMap<String, Vacante>();

            map.put("valor", vacante);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/vacante.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

//    @Command
//    @NotifyChange({"listaDatosPais", "buscarPais"})
//    public void seleccionarRegistros() {
//        registrosSeleccionados = ((ListModelList<EmpresasVacante>) getListaDatosPostulantesModel()).getSelection();
//        if (registrosSeleccionados.size() > 0) {
//            for (EmpresasVacante registrosSeleccionado : registrosSeleccionados) {
//                buscarPostulantes(registrosSeleccionado.getIdvacante());
//                break;
//            }
//        }
//    }
    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public ListModelList<EmpresasParticipantes> getListaDatosPostulantesModel() {
        return listaDatosPostulantesModel;
    }

    public void setListaDatosPostulantesModel(ListModelList<EmpresasParticipantes> listaDatosPostulantesModel) {
        this.listaDatosPostulantesModel = listaDatosPostulantesModel;
    }

//
//    @Command
//    public void exportListboxToExcel() throws Exception {
//        try {
//            File dosfile = new File(exportarExcel());
//            if (dosfile.exists()) {
//                FileInputStream inputStream = new FileInputStream(dosfile);
//                Filedownload.save(inputStream, new MimetypesFileTypeMap().getContentType(dosfile), dosfile.getName());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("ERROR AL DESCARGAR EL ARCHIVO" + e.getMessage());
//        }
//    }
//
//    private String exportarExcel() throws FileNotFoundException, IOException, ParseException {
//        String directorioReportes = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/reportes");
//
//        Date date = new Date();
//        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm");
//        SimpleDateFormat sm = new SimpleDateFormat("yyy-MM-dd");
//        String strDate = sm.format(date);
//
//        String pathSalida = directorioReportes + File.separator + "VacantesFeria.xls";
//        System.out.println("Direccion del reporte  " + pathSalida);
//        try {
//            int j = 0;
//            File archivoXLS = new File(pathSalida);
//            if (archivoXLS.exists()) {
//                archivoXLS.delete();
//            }
//            archivoXLS.createNewFile();
//            FileOutputStream archivo = new FileOutputStream(archivoXLS);
//            HSSFWorkbook wb = new HSSFWorkbook();
//            HSSFSheet s = wb.createSheet("VacantesFeria");
//
//            HSSFFont fuente = wb.createFont();
//            fuente.setBoldweight((short) 700);
//            HSSFCellStyle estiloCelda = wb.createCellStyle();
//            estiloCelda.setWrapText(true);
//            estiloCelda.setAlignment((short) 2);
//            estiloCelda.setFont(fuente);
//
//            HSSFCellStyle estiloCeldaInterna = wb.createCellStyle();
//            estiloCeldaInterna.setWrapText(true);
//            estiloCeldaInterna.setAlignment((short) 5);
//            estiloCeldaInterna.setFont(fuente);
//
//            HSSFCellStyle estiloCelda1 = wb.createCellStyle();
//            estiloCelda1.setWrapText(true);
//            estiloCelda1.setFont(fuente);
//
//            HSSFRow r = null;
//
//            HSSFCell c = null;
//            r = s.createRow(0);
//
//            HSSFCell chfe = r.createCell(j++);
//            chfe.setCellValue(new HSSFRichTextString("Vacante"));
//            chfe.setCellStyle(estiloCelda);
//
//            HSSFCell chfe1 = r.createCell(j++);
//            chfe1.setCellValue(new HSSFRichTextString("Pais"));
//            chfe1.setCellStyle(estiloCelda);
//
//            int rownum = 1;
//            int i = 0;
//
//            for (EmpresasParticipantes item : listaDatos) {
//                i = 0;
//
//                r = s.createRow(rownum);
//
//                HSSFCell cf = r.createCell(i++);
//                cf.setCellValue(new HSSFRichTextString(item.getPuesto().trim()));
//
//                HSSFCell cf1 = r.createCell(i++);
//                cf1.setCellValue(new HSSFRichTextString(item.getPais().trim()));
//
//                rownum += 1;
//
//            }
//
//            for (int k = 0; k <= listaDatos.size(); k++) {
//                s.autoSizeColumn(k);
//            }
//            wb.write(archivo);
//            archivo.close();
//
//        } catch (IOException e) {
//            System.out.println("error " + e.getMessage());
//        }
//        return pathSalida;
//
//    }
    //<editor-fold defaultstate="collapsed" desc=" ATRIBUTOS POSTULANTES"> 
    //</editor-fold > 
    public List<EmpresasVacante> getListaDatos2() {
        return listaDatos2;
    }

    public void setListaDatos2(List<EmpresasVacante> listaDatos2) {
        this.listaDatos2 = listaDatos2;
    }

    public String getBuscar2() {
        return buscar2;
    }

    public void setBuscar2(String buscar2) {
        this.buscar2 = buscar2;
    }

    public EmpresasVacante getPaisSelected() {
        return paisSelected;
    }

    public void setPaisSelected(EmpresasVacante paisSelected) {
        this.paisSelected = paisSelected;
    }

    public String getBuscarPais() {
        return buscarPais;
    }

    public void setBuscarPais(String buscarPais) {
        this.buscarPais = buscarPais;
    }

    public List<EmpresaPostulante> getListaPostulantes() {
        return listaPostulantes;
    }

    public void setListaPostulantes(List<EmpresaPostulante> listaPostulantes) {
        this.listaPostulantes = listaPostulantes;
    }

    public Integer getNumeroRegistros() {
        return numeroRegistros;
    }

    public void setNumeroRegistros(Integer numeroRegistros) {
        this.numeroRegistros = numeroRegistros;
    }

    @Command
    public void abrirPostulante(@BindingParam("valor") EmpresasVacante valor) {

        try {
            final HashMap<String, EmpresasVacante> map = new HashMap<String, EmpresasVacante>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalpostulante.zul", null, map);
            window.doModal();
        } catch (Exception e) {
            Clients.showNotification("Error ." + e.getMessage(),
                    Clients.NOTIFICATION_TYPE_ERROR, null, "end_center", 2000, true);
        }

    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
