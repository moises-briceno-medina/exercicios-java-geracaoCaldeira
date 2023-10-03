package aula07.exercicio05;

import utils.ScanUtils;

public class IdadeInvalidaException extends RuntimeException {
        public IdadeInvalidaException(String mensagem){
            super(mensagem);
        }
}
