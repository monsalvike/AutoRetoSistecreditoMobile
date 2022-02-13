package dafiti.stepdefinitions;

import dafiti.models.ShopperInformation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;


public class ParameterDefinitions {
    @ParameterType(".*")
    public Actor actor (String actorName){
        return OnStage.theActorCalled(actorName);
    }
    @DataTableType
    public ShopperInformation shopperInformation (Map<String,String> data){
        ShopperInformation shopperInformation = new ShopperInformation();
        shopperInformation.setEmail(data.get("email"));
        shopperInformation.setPassword(data.get("password"));
        shopperInformation.setName(data.get("name"));
        shopperInformation.setLastName(data.get("lastName"));
        shopperInformation.setDocumentType(data.get("documentType"));
        shopperInformation.setDocumentNumber(data.get("documentNumber"));
        shopperInformation.setGender(data.get("gender"));
        shopperInformation.setBirthday(data.get("birthday"));
        return shopperInformation;
    }




}
