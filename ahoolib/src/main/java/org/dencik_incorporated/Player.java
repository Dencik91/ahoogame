package org.dencik_incorporated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Data
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickName;
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        if (this.nickName == null) {
            if (player.getNickName() != null)
                return false;
        } else if (!this.nickName.equals(player.getNickName()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName);
    }
}
