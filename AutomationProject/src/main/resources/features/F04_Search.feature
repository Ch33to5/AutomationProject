@smoke
Feature: Search using product name and SKU

  Scenario Outline: searching using product name
    Given user could search using "<productName>"


    Examples:
    |productName|
    |book|
    |laptop|
    |nike|

  Scenario Outline: search for product using sku
    Given user could search using sku "<sku>"


    Examples:
    |sku|
    |SCI_FAITH|
    |APPLE_CAM|
    |SF_PRO_11|
