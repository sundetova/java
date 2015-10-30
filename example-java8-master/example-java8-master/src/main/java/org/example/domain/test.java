package org.example.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer entity bean.
 */
@Entity
@Table(name="testtable")
public class test extends BaseModel {

  /**
   * Convenience Finder for 'active record' style.
   */
  public static final Finder<Long,test> find = new Finder<>(Long.class, test.class);
  
  boolean inactive;
  
  @Column(length=100)
  String name;

 
  public boolean isInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

 
  
}
