package br.com.fiap.bo.impl;

import javax.ejb.Stateless;
import br.com.fiap.bo.CursoBO;

@Stateless
public class CursoBOImpl implements CursoBO {

	@Override
	public float calcularMedia(float nac, float ps, float am, float enade) {
		return nac *0.2f + ps * 0.5f + 0.3f*(am * 0.4f + enade* 0.6f);
	}

}
