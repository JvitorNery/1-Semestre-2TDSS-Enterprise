package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.CursoBO;

@ManagedBean
public class CursoBean {

	private float nac, am, ps, enade, media;
	
	@EJB
	private CursoBO bo;
	
	public void calcular(){
		media = bo.calcularMedia(nac, ps, am, enade);
	}

	public float getNac() {
		return nac;
	}

	public void setNac(float nac) {
		this.nac = nac;
	}

	public float getAm() {
		return am;
	}

	public void setAm(float am) {
		this.am = am;
	}

	public float getPs() {
		return ps;
	}

	public void setPs(float ps) {
		this.ps = ps;
	}

	public float getEnade() {
		return enade;
	}

	public void setEnade(float enade) {
		this.enade = enade;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
}
