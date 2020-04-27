package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "id")
	private int id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "age")
	private int age;
	
//	@OneToMany(targetEntity = Movie.class)
//	private List movielist;
}
