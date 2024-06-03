package org.dencik_incorporated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickName;
    private int score;

}
