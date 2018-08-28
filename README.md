# Project ALG_SystemGaussElimination_Student

Solves general set of equations using Gauss elimination.

Gauss elimination - creates an upper-right matrix, and solve by substitution from the bottom.
Gauss-Jordan - Creates a unit matrix. Additional benefit: Inverse matrix. More time and complex.

Example (first test case):
====

 x + 2y  - z  = 2
-x + 2y  +3z  = 12
-x +  y  +2z  = 7

Solve: Simple case II. 3x3
% Before starting:
A=[...
  1.00   2.00  -1.00   2.00 
 -1.00   2.00   3.00  12.00 
 -1.00   1.00   2.00   7.00 
];

% After iteration 1/ out of 3
A=[...
  1.00   2.00  -1.00   2.00 
  0.00   4.00   2.00  14.00 
  0.00   3.00   1.00   9.00 
];

% After iteration 2/ out of 3
A=[...
  1.00   2.00  -1.00   2.00 
  0.00   1.00   0.50   3.50 
  0.00   0.00  -0.50  -1.50 
];

% After iteration 3/ out of 3
A=[...
  1.00   2.00  -1.00   2.00 
  0.00   1.00   0.50   3.50 
  0.00   0.00   1.00   3.00 
];
 --> Passed successfully





---



