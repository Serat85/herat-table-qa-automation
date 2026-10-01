# Herat Table Restaurant Website QA Automation

A QA automation portfolio project for the Herat Table restaurant
website, built with Java, Selenium WebDriver, TestNG, and Maven.

The project validates key website interactions that help visitors
explore the restaurant, find its location, read reviews, discover
catering information, and access the contact section.

## Business Purpose

Restaurant websites need clear navigation and accessible information.
Broken links or missing content can prevent visitors from finding
what they need.

This project checks that navigation links reach the expected
sections, important content becomes visible, and the contact form
accepts text input.

It is a portfolio demonstration using a restaurant website,
rather than a commissioned client engagement.

## Project Highlights

* Built the automation framework from scratch in Eclipse
* Organized locators and actions using the Page Object Model
* Created automated smoke and functional UI tests
* Used CSS selectors and IDs to locate elements
* Added explicit waits for animated content
* Verified navigation destinations and section visibility
* Checked contact-form text entry
* Demonstrated failure screenshot capture in the About test
* Reviewed TestNG results and HTML reports
* Documented setup, troubleshooting, and test results

## Tools and Technologies

|Tool|Purpose|
|-|-|
|Java|Test code and reusable methods|
|Selenium WebDriver|Browser automation and element interaction|
|TestNG|Test execution, assertions, and reporting|
|Maven|Dependency and project management|
|Eclipse|Development and debugging|
|Git and GitHub|Version control and portfolio sharing|

## Test Coverage

|Website area|Behavior checked|
|-|-|
|Home page|Main heading is visible|
|Menu|Navigation reaches the menu section|
|About|Navigation reaches the About section|
|Location|Navigation reaches the location section|
|Reviews|Navigation reaches the reviews section|
|Catering|Navigation reaches the catering section|
|Contact|Navigation reaches the contact section and text can be entered|

Navigation tests check the expected URL fragment and the visibility
of the corresponding section.

The contact check validates text entry. It does not verify message
submission or delivery.

These tests provide focused home-page and navigation coverage;
they do not constitute complete testing of the website.

## Latest Local Results

The latest local execution completed seven tests with seven passes.

This result describes a specific execution. Changes to the website,
browser, environment, or test code may affect future results.

## Framework Structure

* HeratTableSmokeTest.java
Home-page smoke test.
* pages/HomePage.java
Website locators, reusable navigation actions, and methods
for checking headings and section visibility.
* pages/HeratTableUiTest.java
Functional UI tests and assertions.
* utilities/screenshotHelper.java
Browser screenshot utility.
* pom.xml
Maven configuration and project dependencies.

## Design Decisions

### Page Object Model

Locators and website interactions are kept in the HomePage class.
Tests call these methods and assert the expected results.

This separation makes tests easier to read and allows shared
actions to be reused. Locator changes can be maintained in
the page class.

### Explicit Waits

The website includes reveal animations. Explicit waits allow
relevant elements to become visible before assertions run.

This helps reduce failures caused by checking content too early.

### Assertions

Assertions verify actual behavior against an expected result.
Navigation checks confirm the destination URL fragment and
the visibility of the target section.

Failure messages explain which expectation was not met.

### Browser Cleanup

The browser is closed in a finally block, allowing cleanup
whether a test passes or fails.

## Failure Investigation

Screenshot handling was verified by deliberately changing an
expected navigation value in the About test.

The test failed, saved a browser screenshot, and retained the
failure in the TestNG results. After the correct expectation
was restored, the test was rerun and passed.

This demonstrated troubleshooting of a test expectation mismatch.
It was not evidence of a confirmed website defect.

Failure screenshot capture is currently connected to the
About test.

## How to Run Locally

### Requirements

* A JDK compatible with the project's pom.xml
* Google Chrome
* Eclipse with Maven support and the TestNG plugin
* The separate Herat Table website files
* A local web server, such as VS Code Live Server

### Instructions

1. Clone or download this repository.
2. In Eclipse, select:
File → Import → Maven → Existing Maven Projects.
3. Select the project folder and complete the import.
4. Allow Maven to download the dependencies.
5. Start the restaurant website locally at:
http://127.0.0.1:5500/index.html
6. Right-click a test class:
Run As → TestNG Test.
7. Review the TestNG results and Console output.

The website files are maintained separately and are required
to reproduce the tests.

The localhost address refers to the computer running the tests.
It is not a publicly hosted website.

## Reports and Screenshots

* TestNG HTML reports are generated in test-output.
* About test failure screenshots are saved in screenshots.

Generated builds, reports, screenshots, and Eclipse settings
are excluded from Git through .gitignore.

## Project Status

Completed:

* Maven project and dependencies
* Page Object classes
* Smoke and functional UI tests
* Contact-form text-entry check
* About test failure screenshots
* TestNG reporting
* Documentation of development and troubleshooting

Planned:

* Jenkins integration for automated execution
* Failure screenshot handling for the remaining tests
* Additional positive and negative test cases

## Author

Mohammad Nazir Sirat
QA Automation Portfolio

