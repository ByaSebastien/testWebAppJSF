package be.bstorm.testwebappjsf.configs;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;


@ApplicationScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3)  //Activation CDI
public class ApplicationConfiguration {

}