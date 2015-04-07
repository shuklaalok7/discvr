package in.discvr.android.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author shuklaalok7
 * @since 7/4/15 05:21
 */
@Getter
@Setter
public class Address implements Serializable {
    private String houseNumber;
    private String street;
    private String landmark;
    private String area;
    private String city;
    private String state;
    private String country;
    private int pinCode;

}
