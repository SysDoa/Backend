package br.com.sysdoa.sysdoa.infra.constants;

public final class ExceptionMessageConstant {

    public static final String errorDataBase = "Dados duplicados ou violação de integridade: ";

    public static final String errorSave = "Erro ao salvar dados! ";

    public static final String notFound(String name) {
        return name + " não encontrado!";
    }

}
