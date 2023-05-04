package in.abhi_devoloper.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "comment")
public class Comment {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private long id;
      private String name;
      private String email;
      @Lob
      private String body; 
      private LocalDate createdOn;
      @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "posts_id", nullable = false)
      private Post post;

     
}
