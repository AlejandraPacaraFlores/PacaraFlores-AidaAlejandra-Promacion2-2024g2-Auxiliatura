package Laboratorio2ale;

import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L; // Versión de la serialización

    private String name;
    private String email;
    private Integer age;
    private String phone;

    public Contact(String name, String email, int age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
	
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Método para representar el objeto como cadena
    @Override
    public String toString() {
        return "Contact{" +
                "Nombre='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Edad=" + age +
                ", Celular='" + phone + '\'' +
                '}';
    }
}
