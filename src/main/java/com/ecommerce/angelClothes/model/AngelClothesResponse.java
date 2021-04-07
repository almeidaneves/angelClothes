package com.ecommerce.angelClothes.model;

import com.sun.source.doctree.SerialDataTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AngelClothesResponse implements Serializable {

    private int responseCode;
    private String description;
}
