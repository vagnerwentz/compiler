package recovery;

import compiler.*;

public class First {

    static public final RecoverySet compiler = new RecoverySet();
    static public final RecoverySet id = new RecoverySet();
    static public final RecoverySet bloco = new RecoverySet();

    static {
    	compiler.add(new Integer(CompilerConstants.INICIO_COMPILER));
    	
    	bloco.add(new Integer(CompilerConstants.TIPO_BOOL));
    	
//    	idNome.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	idNome.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	
//    	executarFuncao.add(new Integer(TopScriptConstants.ABRE_PARENTESES));
//    	
//    	dado.add(new Integer(TopScriptConstants.DIGITO));
//    	dado.add(new Integer(TopScriptConstants.OP_SUB));
//    	dado.add(new Integer(TopScriptConstants.ASPA));
//    	dado.add(new Integer(TopScriptConstants.BOOL_FALSE));
//    	dado.add(new Integer(TopScriptConstants.BOOL_TRUE));
//    	dado.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	dado.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	
//    	constante.add(new Integer(TopScriptConstants.DIGITO));
//    	constante.add(new Integer(TopScriptConstants.OP_SUB));
//    	constante.add(new Integer(TopScriptConstants.ASPA));
//    	constante.add(new Integer(TopScriptConstants.BOOL_TRUE));
//    	constante.add(new Integer(TopScriptConstants.BOOL_FALSE));
//    	
//    	chamadorDeIdNome.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	chamadorDeIdNome.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	
//    	retorno.add(new Integer(TopScriptConstants.RETORNO));
//    	
//    	letra.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	letra.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	
//    	texto.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	texto.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	
//    	operador.add(new Integer(TopScriptConstants.OP_SUM));
//    	operador.add(new Integer(TopScriptConstants.OP_SUB));
//    	operador.add(new Integer(TopScriptConstants.OP_MUL));
//    	operador.add(new Integer(TopScriptConstants.OP_DIV));
//    	operador.add(new Integer(TopScriptConstants.OP_AND));
//    	operador.add(new Integer(TopScriptConstants.OP_DIF));
//    	operador.add(new Integer(TopScriptConstants.OP_EQ));
//    	operador.add(new Integer(TopScriptConstants.OP_GT));
//    	operador.add(new Integer(TopScriptConstants.OP_LT));
//    	operador.add(new Integer(TopScriptConstants.OP_MOD));
//    	operador.add(new Integer(TopScriptConstants.OP_OR));
//    	
//    	expressao.add(new Integer(TopScriptConstants.DIGITO));
//    	expressao.add(new Integer(TopScriptConstants.OP_SUB));
//    	expressao.add(new Integer(TopScriptConstants.ASPA));
//    	expressao.add(new Integer(TopScriptConstants.BOOL_FALSE));
//    	expressao.add(new Integer(TopScriptConstants.BOOL_TRUE));
//    	expressao.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	expressao.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
//    	expressao.add(new Integer(TopScriptConstants.ABRE_PARENTESES));
//    	
//    	string.add(new Integer(TopScriptConstants.ASPA));
//    	
//    	funcao.add(new Integer(TopScriptConstants.ABRE_COLCHETES));
//    	
//    	idTipo.add(new Integer(TopScriptConstants.TIPO_BOOL));
//    	idTipo.add(new Integer(TopScriptConstants.TIPO_FUNCAO));
//    	idTipo.add(new Integer(TopScriptConstants.TIPO_NUMERO));
//    	idTipo.add(new Integer(TopScriptConstants.TIPO_TEXTO));
//    	
//    	atribuicao.add(new Integer(TopScriptConstants.ATRIBUI));
//    	
//    	declaraVariaveis.add(new Integer(TopScriptConstants.TIPO_BOOL));
//    	declaraVariaveis.add(new Integer(TopScriptConstants.TIPO_FUNCAO));
//    	declaraVariaveis.add(new Integer(TopScriptConstants.TIPO_NUMERO));
//    	declaraVariaveis.add(new Integer(TopScriptConstants.TIPO_TEXTO));
//    	
//    	repeticaoPara.add(new Integer(TopScriptConstants.PARA));
//    	
//    	repeticaoEnquanto.add(new Integer(TopScriptConstants.ENQUANTO));
//    	
//    	condicional.add(new Integer(TopScriptConstants.SE));
//    	
//    	numero.add(new Integer(TopScriptConstants.DIGITO));
//    	numero.add(new Integer(TopScriptConstants.OP_SUB));
//    	
//    	bloco.add(new Integer(TopScriptConstants.TIPO_BOOL));
//    	bloco.add(new Integer(TopScriptConstants.TIPO_FUNCAO));
//    	bloco.add(new Integer(TopScriptConstants.TIPO_NUMERO));
//    	bloco.add(new Integer(TopScriptConstants.TIPO_TEXTO));
//    	bloco.add(new Integer(TopScriptConstants.PARA));
//    	bloco.add(new Integer(TopScriptConstants.ENQUANTO));
//    	bloco.add(new Integer(TopScriptConstants.SE));
//    	bloco.add(new Integer(TopScriptConstants.RETORNO));
//    	bloco.add(new Integer(TopScriptConstants.LETRA_MAIUSCULA));
//    	bloco.add(new Integer(TopScriptConstants.LETRA_MINUSCULA));
    }
}