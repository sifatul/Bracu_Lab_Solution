# lexical analyzer 
Program a simple lexical analyzer that will build a symbol table from given stream of chars. You will need to read a file named "input.txt" to collect all chars. For simplicity, input file will be a C program without headers and methods. Then you will identify all the numerical values, identifiers, keywords, math operators, logical operators and others [distinct]. 

#Input:
```
int a, b, c;
float d, e;
a = b = 5;
c = 6;
sum;
if (a >= b)
{
	c = a - b;
	e = d * 2.0;
}
else
{
	d = e + 6.0;
	b = a % c;
	sum=b+d;
}
```

#Output:
```
Keywords:  ['int', 'float', 'if', 'else']
mathoperator:  ['=', '-', '*', '+', '%']
logicalOperator:  ['>=']
NumericalValue:  ['5', '6', '2', '0', '.', '6', '0']
identifier:  ['a', 'b', 'c', 'd', 'e', 'sum']
other:  [',', ';', '(', ')', '{', '}']

```

