$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testCases/Checkout.feature");
formatter.feature({
  "line": 3,
  "name": "new implementation of booking feature",
  "description": "",
  "id": "new-implementation-of-booking-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@book"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "verify the product name and price",
  "description": "",
  "id": "new-implementation-of-booking-feature;verify-the-product-name-and-price",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@productVerify"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open  browser as firefox",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter url as https://www.flipkart.com/",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search product as samsung",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click the first link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "switch to child window",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the product name and price",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 17
    }
  ],
  "location": "VerifyProduct.openbrowser(String)"
});
formatter.result({
  "duration": 6722245898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.flipkart.com/",
      "offset": 13
    }
  ],
  "location": "VerifyProduct.enterurl(String)"
});
formatter.result({
  "duration": 7929539565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "samsung",
      "offset": 18
    }
  ],
  "location": "VerifyProduct.searchproduct(String)"
});
formatter.result({
  "duration": 951396825,
  "status": "passed"
});
formatter.match({
  "location": "VerifyProduct.clickLink()"
});
formatter.result({
  "duration": 9534688472,
  "status": "passed"
});
formatter.match({
  "location": "VerifyProduct.switchChildWindow()"
});
formatter.result({
  "duration": 5467139363,
  "status": "passed"
});
formatter.match({
  "location": "VerifyProduct.VerifyProduct()"
});
formatter.result({
  "duration": 157525,
  "status": "passed"
});
});