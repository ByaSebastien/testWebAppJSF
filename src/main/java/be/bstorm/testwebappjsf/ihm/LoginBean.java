package be.bstorm.testwebappjsf.ihm;

import be.bstorm.testwebappjsf.validators.Email;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Named;
import jakarta.validation.constraints.Size;
import java.io.Serializable;


@Named/*("loginBean")*/
@SessionScoped
public class LoginBean implements Serializable {


    private static final long serialVersionUID = -5433850275008415405L;

    @Size(min = 1)
    private String login = "";

    @Email(message = "Email invalide.")
    private String email;

    @Size(min = 3,max = 12)
    private String password = "";
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String returnAction() {
        System.out.println( "in returnAction" );
        return password.equals( "007" ) ? "success" : "failure";
    }

    public void validateAField(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String inputValue = (String) value;
        if ( ! inputValue.contains( "#" ) ) {
            FacesMessage msg = new FacesMessage( "Mauvais format : doit contenir un #" );
            msg.setSeverity( FacesMessage.SEVERITY_ERROR );
            throw new ValidatorException(msg);
        }
    }
}