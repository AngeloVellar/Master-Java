package com.ar.peluqueriacanina.persistencia;

import com.ar.peluqueriacanina.logica.Mascota;
import com.ar.peluqueriacanina.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MascotaController {

    EntityManager em = JpaUtil.getEntityManager();

}
