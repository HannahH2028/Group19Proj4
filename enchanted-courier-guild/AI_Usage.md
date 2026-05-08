AI Tools and Models Used: Claude Sonnet 4.6, Gemini 3.1 Pro

Explanation: The way AI was leverage was typically through a system of providing it test code
then having it generate an implementation that is designed to pass the tests rather than generating
code that I would compare to the tests. After Generation of code, the Maven testing was used to ensure
that the code passed the inspections and requirements needed. When encountering any bugs in code
I would look at the code myself, find the problem and either manually repair it or have AI implement 
a specified repair.

Prompts: If any prompts were used they are located at the top of each file.

Reflection: I accepted the majority of the code outputted by the AI, unless it failed any testing 
or had glaring issues. I primarily would only change small details like formatting or with one specific
file, I had to manually find the error and fix it myself after locating the issue. This occured in RealmFactoryProvider
where the fix was to remove some unreachable code that was failing the JaCoCo 100% coverage. The way the code was 
verified to be correct was through the usage of the Maven testing.