import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

/**
 * Created by dmclark on 08/08/17.
 */
public class Home {


    @FindBy(css = "#postcode")
    private WebElement postcode;
    @FindBy(css = "#radius")
    private WebElement radius;
    @FindBy(css = "#searchVehicles > div > div.global__quicksearchform--tickboxes.cf > fieldset.checkfieldused > label")
    private WebElement used;
    @FindBy(css = "#searchVehicles > div > div.global__quicksearchform--tickboxes.cf > fieldset.checkfieldnearlynew > label")
    private WebElement nearly_new;
    @FindBy(css = "#searchVehicles > div > div.global__quicksearchform--tickboxes.cf > fieldset.checkfieldbrandnew > label")
    private WebElement new_;
    @FindBy(css = "#searchVehiclesMake")
    private WebElement make;
    @FindBy(css = "#searchVehiclesModel")
    private WebElement model;
    @FindBy(css = "#searchVehiclesPriceFrom")
    private WebElement priceFrom;
    @FindBy(css = "#searchVehiclesPriceTo")
    private WebElement priceTo;
    @FindBy(css = "#search")
    private WebElement search;

    @FindBy(css = "#radius > option:nth-child(1)")
    private WebElement radius1;


    @FindBy(css = "#radius > option:nth-child(2)")
    private WebElement radius2;


    @FindBy(css = "#radius > option:nth-child(3)")
    private WebElement radius3;


    @FindBy(css = "#radius > option:nth-child(4)")
    private WebElement radius4;


    @FindBy(css = "#radius > option:nth-child(5)")
    private WebElement radius5;


    @FindBy(css = "#radius > option:nth-child(6)")
    private WebElement radius6;


    @FindBy(css = "#radius > option:nth-child(7)")
    private WebElement radius7;


    @FindBy(css = "#radius > option:nth-child(8)")
    private WebElement radius8;


    @FindBy(css = "#radius > option:nth-child(9)")
    private WebElement radius9;


    @FindBy(css = "#radius > option:nth-child(10)")
    private WebElement radius10;


    @FindBy(css = "#radius > option:nth-child(11)")
    private WebElement radius11;


    @FindBy(css = "#radius > option:nth-child(12)")
    private WebElement radius12;


    @FindBy(css = "#radius > option:nth-child(13)")
    private WebElement radius13;


    @FindBy(css = "#radius > option:nth-child(14)")
    private WebElement radius14;


    @FindBy(css = "#radius > option:nth-child(15)")
    private WebElement radius15;


    @FindBy(css = "#radius > option:nth-child(16)")
    private WebElement radius16;


    @FindBy(css = "#radius > option:nth-child(17)")
    private WebElement radius17;


    @FindBy(css = "#radius > option:nth-child(18)")
    private WebElement radius18;


    @FindBy(css = "#radius > option:nth-child(19)")
    private WebElement radius19;

ArrayList<WebElement> list_R = new ArrayList<WebElement>();
public Home(){
    list_R.add(radius19);
    list_R.add(radius18);
    list_R.add(radius17);
    list_R.add(radius16);
    list_R.add(radius15);
    list_R.add(radius14);
    list_R.add(radius13);
    list_R.add(radius12);
    list_R.add(radius11);
    list_R.add(radius10);
    list_R.add(radius9);
    list_R.add(radius8);
    list_R.add(radius7);
    list_R.add(radius6);
    list_R.add(radius5);
    list_R.add(radius4);
    list_R.add(radius3);
    list_R.add(radius2);
    list_R.add(radius1);
}
    public void set_postcode(String val) {
        postcode.sendKeys(val);
    }

    public void set_radius(int val) {
//    }
        Select r = new Select(radius);
        r.selectByValue(val+"");


//        radius.click();
//        //radius.sendKeys(Keys.RETURN);


    }

    public void set_used(boolean val) {
    if (!val){
        used.click();
    }

    }

    public void set_nearly_new(boolean val) {

        if (!val){
            nearly_new.click();
        }
    }

    public void set_new_(boolean val) {

        if (!val){
            new_.click();
        }
    }

    public void set_make(String val) {
        make.sendKeys(val,Keys.RETURN);
    }

    public void set_model(String val) {
        model.sendKeys(val,Keys.RETURN);
    }

    public void set_priceFrom(int val) {
        Select r = new Select(priceFrom);
        r.selectByValue(val+"");
    }

    public void set_priceTo(int val) {

        Select r = new Select(priceTo);
        r.selectByValue(val+"");


    }

    public void set_search() {
        search.click();
    }

//    public void set_username(String uname) {
//        username.sendKeys(uname);
//    }
//
//    public void set_password(String pass) {
//        password.sendKeys(pass);
//    }
//
//    public void set_submit() {
//        submit.click();
//    }
//    public void set_Login() {
//        submit.click();
//    }


}
