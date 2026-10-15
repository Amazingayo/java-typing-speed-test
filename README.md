# Console Typing Speed Test (Java)

A lightweight, terminal-based typing speed test built with Java. This program displays a randomized sentence, measures how fast you type it using high-precision system timers, and calculates your Words Per Minute (WPM) and character accuracy.

## Features
- **Randomized Prompts:** Selects from a pool of predefined sentences for each test.
- **High-Precision Timing:** Uses `System.nanoTime()` for accurate elapsed time measurement.
- **Detailed Metrics:**
  - **Time Elapsed:** Total time taken in seconds.
  - **Gross WPM:** Raw typing speed based on standard 5-character word lengths.
  - **Net WPM:** Typing speed adjusted for accuracy (only counts matching characters).
  - **Accuracy Percentage:** Character-by-character comparison between the target sentence and user input.

## Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher installed on your machine.

## How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Amazingayo/java-typing-speed-test.git](https://github.com/Amazingayo/java-typing-speed-test.git)
   cd java-typing-speed-test
