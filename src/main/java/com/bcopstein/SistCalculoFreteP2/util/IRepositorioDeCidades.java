package com.bcopstein.SistCalculoFreteP2.util;

import java.util.List;

public interface IRepositorioDeCidades {
    List<Cidade> todas();
    Cidade get(long id);
    Cidade get(String nome); }
