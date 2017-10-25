package com.oxande.vinci.vm;

import java.math.BigDecimal;

import com.oxande.vinci.grammar.VinciClass;

public class VinciVariable {
    String value;
    VinciClass type;

    public VinciVariable(BigDecimal v){
        this.type = VinciClass.FLOAT;
        this.value = v.toString();
    }

    public BigDecimal decimalValue(){
        if( this.type != VinciClass.FLOAT ){
            throw new IllegalStateException("Not a FLOAT value.");
        }
        return new BigDecimal(value);
    }
}
