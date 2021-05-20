package Pages;
import Pages.AlertsFramesWindows.*;
import Pages.BookStoreApplication.BSDetailsPage;
import Pages.BookStoreApplication.BSLoginPage;
import Pages.BookStoreApplication.BSLogoutPage;
import Pages.Elements.*;
import Pages.Forms.FormsPage;
import Pages.Forms.PracticeFormPage;
import Pages.Interactions.*;
import Pages.Widgets.*;
import driverInstance.driverInitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static final WebDriver driver;
    public static final WebDriverWait wait;

    public Pages.BookStoreApplication.BSLoginPage BSLoginPage;

    public Pages.BookStoreApplication.BSDetailsPage BSDetailsPage;

    public Pages.BookStoreApplication.BSLogoutPage BSLogoutPage;

    public Pages.Elements.ElementsHomePage ElementsHomePage;

    public Pages.Elements.TextBoxPage TextBoxPage;

    public Pages.Elements.CheckBoxPage CheckBoxPage;

    public Pages.Elements.RadioButtonPage RadioButtonPage;

    public Pages.Elements.WebTablesPage WebTablesPage;

    public Pages.Elements.Buttons Buttons;

    public Pages.Elements.LinksPage LinksPage;

    public Pages.Elements.UploadDownloadPage UploadDownloadPage;

    public Pages.Elements.DynamicPropertiesPage DynamicPropertiesPage;

    public Pages.Elements.BrokenLinksImagesPage BrokenLinksImagesPage;

    public Pages.Forms.FormsPage FormsPage;

    public Pages.Forms.PracticeFormPage PracticeFormPage;

    public Pages.AlertsFramesWindows.AFWMainPage AFWMainPage;

    public Pages.AlertsFramesWindows.Frames Frames;

    public Pages.AlertsFramesWindows.NestedFrames NestedFrames;

    public Pages.AlertsFramesWindows.ModalDialogsPage ModalDialogsPage;

    public Pages.AlertsFramesWindows.BrowserWindows BrowserWindows;

    public Pages.AlertsFramesWindows.AlertsPage AlertsPage;

    public Pages.Widgets.WidgetsHome WidgetsHome;

    public Pages.Widgets.AccordianPage AccordianPage;

    public Pages.Widgets.Slider Slider;

    public Pages.Widgets.ProgressBarPage ProgressBarPage;

    public Pages.Widgets.Tabs Tabs;

    public Pages.Widgets.ToolTipsPage ToolTipsPage;

    public Pages.Widgets.MenuPage MenuPage;

    public Pages.Widgets.DateAndTime DateAndTime;

    public Pages.Widgets.AutoCompletePage AutoCompletePage;

    public Pages.Interactions.InteractionsHomePage InteractionsHomePage;

    public Pages.Interactions.Selectable Selectable;

    public Pages.Interactions.ResizablePage ResizablePage;

    public Pages.Interactions.Droppable Droppable;

    public Pages.Interactions.DraggablePage DraggablePage;

    public Pages.Interactions.SortablePage SortablePage;

    public BasePage()
    {
       initScreens();
    }

    private void initScreens()
    {

    BSLoginPage = new BSLoginPage(driver,wait);

    BSDetailsPage = new BSDetailsPage(driver,wait);

    BSLogoutPage = new BSLogoutPage(driver,wait);

    ElementsHomePage = new ElementsHomePage(driver,wait);

    TextBoxPage = new TextBoxPage(driver,wait);

    CheckBoxPage = new CheckBoxPage(driver,wait);

    RadioButtonPage = new RadioButtonPage(driver,wait);

    WebTablesPage = new WebTablesPage(driver,wait);

    Buttons = new Buttons(driver,wait);

    LinksPage = new LinksPage(driver,wait);

    UploadDownloadPage = new UploadDownloadPage(driver,wait);

    DynamicPropertiesPage = new DynamicPropertiesPage(driver,wait);

    BrokenLinksImagesPage = new BrokenLinksImagesPage(driver,wait);

    FormsPage = new FormsPage(driver,wait);

    PracticeFormPage = new PracticeFormPage(driver,wait);

    AFWMainPage = new AFWMainPage(driver,wait);

    Frames = new Frames(driver,wait);

    NestedFrames = new NestedFrames(driver,wait);

    ModalDialogsPage = new ModalDialogsPage(driver,wait);

    BrowserWindows = new BrowserWindows(driver,wait);

    AlertsPage = new AlertsPage(driver,wait);

    WidgetsHome = new WidgetsHome(driver,wait);

    AccordianPage = new AccordianPage(driver,wait);

    Slider = new Slider(driver,wait);

    ProgressBarPage = new ProgressBarPage(driver,wait);

    Tabs = new Tabs(driver,wait);

    ToolTipsPage = new ToolTipsPage(driver,wait);

    MenuPage = new MenuPage(driver,wait);


    DateAndTime = new DateAndTime(driver, wait);

    AutoCompletePage =new AutoCompletePage(driver,wait);

    InteractionsHomePage = new InteractionsHomePage(driver,wait);

    Selectable = new Selectable(driver,wait);

    ResizablePage = new ResizablePage(driver,wait);

    Droppable = new Droppable(driver,wait);

    DraggablePage = new DraggablePage(driver,wait);

    SortablePage = new SortablePage(driver,wait);
    }

    static{
        driver = driverInitialization.getDriverInstance();
        wait =  driverInitialization.waitInstance(driver);
    }
}
