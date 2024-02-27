Below is a detailed README.md file for your Selenium 101 assignment task:

---

# Selenium 101 Assignment Task

This project is designed to demonstrate Selenium WebDriver automation for testing scenarios on LambdaTest's Selenium Playground.

## Test Scenarios

### Test Scenario 1: Simple Form Demo

1. Open LambdaTest’s Selenium Playground from [https://www.lambdatest.com/selenium-playground](https://www.lambdatest.com/selenium-playground).
2. Click “Simple Form Demo” under Input Forms.
3. Validate that the URL contains “simple-form-demo”.
4. Create a variable for a string value, e.g., “Welcome to LambdaTest”.
5. Use this variable to enter values in the “Enter Message” text box.
6. Click “Get Checked Value”.
7. Validate whether the same text message is displayed in the right-hand panel under the “Your Message:” section.

### Test Scenario 2: Drag & Drop Sliders

1. Open the [https://www.lambdatest.com/selenium-playground](https://www.lambdatest.com/selenium-playground) page.
2. Click “Drag & Drop Sliders” under “Progress Bars & Sliders”.
3. Select the slider “Default value 15” and drag the bar to make it 95 by validating whether the range value shows 95.

### Test Scenario 3: Input Form Submit

1. Open the [https://www.lambdatest.com/selenium-playground](https://www.lambdatest.com/selenium-playground) page.
2. Click “Input Form Submit” under “Input Forms”.
3. Click “Submit” without filling in any information in the form.
4. Assert “Please fill in the fields” error message.
5. Fill in Name, Email, and other fields.
6. From the Country drop-down, select “United States” using the text property.
7. Fill all fields and click “Submit”.
8. Once submitted, validate the success message “Thanks for contacting us, we will get back to you shortly.” on the screen.

## Installation and Setup

To run the Selenium tests for the assignment, follow these steps:

1. Clone this repository to your local machine:

```bash
git clone https://github.com/yourusername/selenium-101-assignment.git
```

2. Install Python and pip if you haven't already.

3. Install the necessary Python packages using pip:

```bash
pip install selenium
```

4. Download the appropriate WebDriver for your browser (Chrome, Firefox, etc.) and ensure it's in your system PATH.

## Running Tests

1. Navigate to the project directory:

```bash
cd selenium-101-assignment
```

2. Run the test scripts using a test runner or directly through the command line.

```bash
python test_scenarios.py
```

## Contributing

Contributions to improve this project are welcome! Please fork the repository, make your changes, and submit a pull request with a clear description of your changes.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to customize this README.md file further with additional information, such as troubleshooting tips, environment setup instructions, or any other details specific to your project requirements.
