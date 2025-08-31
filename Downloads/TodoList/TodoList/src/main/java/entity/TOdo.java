package entity;
import lombok.ToString;
import lombok.Getter;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Getter
@ToString



public class TOdo {
 private final int id;
 private final String title;
 private final String description;

}
