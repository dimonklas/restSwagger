package swagger.petstore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import javax.annotation.Generated;

@Data
@ToString
@Generated("com.robohorse.robopojogenerator")
public class Category {

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private int id;
}