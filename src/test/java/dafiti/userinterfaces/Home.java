package dafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static Target BTNMYACCOUNT = Target.the("btn my account").located(By.id("br.com.dafiti:id/navigation_account"));
    public static Target BTNREGISTER = Target.the("btn Register").located(By.id("br.com.dafiti:id/account_email"));
    public static Target BTNCREATEACCOUNT = Target.the("bnt create account").located(By.id("br.com.dafiti:id/create_account"));
    public static Target TEXTFIELDEMAIL = Target.the("text fiedl email").located(By.id("br.com.dafiti:id/form_email"));
    public static Target TEXTFLIEDPASSWORD = Target.the("text field password").located(By.id("br.com.dafiti:id/form_password"));
    public static Target TEXTFIELDCONFIRMPASSWORD = Target.the("text field").located(By.id("br.com.dafiti:id/form_password_confirm"));
    public static Target SELECTDOCUMENTTYPE = Target.the("select document type").located(By.id("br.com.dafiti:id/form_document_type"));
    public static Target SELECTORDOCUMENTTYPE = Target.the("selector document type").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
    public static Target TEXTFIEDLDOCUMENTNUMBER = Target.the("text field document number").located(By.id("br.com.dafiti:id/form_identification"));
    public static Target TEXTFIELDNAME = Target.the("text field name").located(By.id("br.com.dafiti:id/form_first_name"));
    public static Target TEXTFIEDLLASTNAME = Target.the("text field last name").located(By.id("br.com.dafiti:id/form_last_name"));
    public static Target TEXTFIELBIRTHDAY = Target.the("text field birthday").located(By.id("br.com.dafiti:id/form_birthday"));
    public static Target SELECTGENDER = Target.the("select gender").located(By.id("br.com.dafiti:id/form_gender"));
    public static Target SELECTORGENDER = Target.the("selector gender").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
    public static Target BTNREGISTERACOUNT = Target.the("btn register account").located(By.id("br.com.dafiti:id/register_button"));
    public static Target SEARCHINPUT = Target.the("input search").located(By.id("br.com.dafiti:id/search_input"));
    public static Target SEEALL = Target.the("see all products").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView"));
    public static Target BTNADDTOCARTGYSMAK = Target.the("add to cart item GYSMAK").located(By.xpath("//android.widget.Button[@content-desc=\"AGREGAR AL CARRITO\"]"));
    public static Target BTNGOCART = Target.the("btn go cart").located(By.xpath("//android.widget.ImageView[@content-desc=\"Carrito\"]"));
    public static Target ITEMADDRESULT = Target.the("item add result").located(By.id("br.com.dafiti:id/item_desc"));
    public static Target CLICKSEARCH = Target.the("click search").located(By.id("br.com.dafiti:id/search_results"));
    public static Target BTNGOTHEAPP = Target.the("go the app").located(By.xpath("//android.view.View[@content-desc=\"IR AL APP\"]"));
}

