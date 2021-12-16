# TextInputEditTextBug
Demonstrates a bug with TextInputEditText that hangs an espresso instrumentation test

For https://github.com/material-components/material-components-android/issues/502

To run the test:
gradlew -Pandroid.testInstrumentationRunnerArguments.class=com.jason.marks.textinputedittextbug.ExampleInstr
umentedTest connectedAndroidTest

Espresso will hang indefinitely when running this test.  If you change the 
TextInputLayout's (R.id.my_dialog_fragment_text_input_layout) width to "match_parent" the bug
goes away.
