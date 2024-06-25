package giovannighirardelli.u5w2d2.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost {
    private int id;
    private String categoria;
    private String cover;
    private String contenuto;
    private int tempoLettura;

}
