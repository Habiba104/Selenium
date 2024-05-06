package Tests;

import Pages.ProductDetailsPge;
import Pages.SearchPge;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase
{
    String productName = "Apple MacBook Pro 13-inch";
    SearchPge searchObject;
    ProductDetailsPge productDetailsObject;
    @Test
    public void UserCanSearchForProducts()
    {
    searchObject=new SearchPge(driver);
    searchObject.searchForProduct(productName);
    searchObject.
    productDetailsObject=new ProductDetailsPge(driver);
    Assert.assertTrue(productDetailsObject.productNameInNextPage.getText().contains(productName));
   //Assert.assertEquals(productDetailsObject.productNameInNextPage.getText(),productName);
    }



}
