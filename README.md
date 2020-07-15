Merchant's Guide to the Galaxy

Problem :
Input to the program consists of a file with lines of text detailing the conversion between intergalactic units and roman numerals.
Process the file and solve the queries. Also handle invalid queries appropriately.

Assumptions : 
1) Input files will consist 3 types of patterns as :
   - Intergalactic unit to Roman units mapping
   - Credits of no. of units of metal
   - Queries as "how much is" / "how many credits is" with "?" at the end
2) Roman symbols include I,V,X,L,C,D and M
3) Intergalactic unit to Roman units mapping pattern as :
   <intergalactic unit> is <I|V|X|L|C|D|M>
4) Credits for metal pattern as :
   <no. of units> <metal> is Credits
5) Queries pattern as
   how (much|many Credits)is <no of units> [<metal>] ?

Solution :
Program will process each line in the input file using Factory.
For each pattern, a processor is generated. Based on the pattern, factory will return the respective pattern processor and it will process the pattern.


How to run the program :
If the <file path/file name> (Full file path) is given as argument to main, then the file will be processed.
Or else input.txt file in the src/galaxy/merchant package will be processed and output will be printed on the console.

** To run from command prompt :
1) Extract the ZIP file to MerchantGalaxySolution
2) Go to MerchantGalaxySolution folder and open command prompt
3) javac -d bin -sourcepath src src/galaxy/merchant/MerchantGalaxySolution.java
4) java -cp bin galaxy.merchant.MerchantGalaxySolution
   (src/galaxy/merchant/input.txt file will be processed)
   OR
   java -cp bin galaxy.merchant.MerchantGalaxySolution "C:\Users\sawantp\THOUGHTWORKS\MerchantGalaxyProblem\src\galaxy\merchant\readFile\input.txt"
   (The input file given will be processed)

** To run from IDE
1) import project MerchantGalaxySolution src folder
2) Run the project
   If input file is given as command line argument, then that file will be processed
   Else src/galaxy/merchant/input.txt file will be processed and output will be displayed on command prompt.
