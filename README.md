# Multithreading

## Table of Contents
1. [Introduction](#introduction)
2. [Multithreading](#multithreading)
3. [Concurrency vs Parallelism](#concurrency-vs-parallelism)
    1. [Concurrency](#concurrency)
    2. [Parallelism](#parallelism)
4. [Process vs Thread](#process-vs-thread)
5. [Time Slicing Algorithm](#time-slicing-algorithm)
6. [Pros and Cons of Multithreading](#pros-and-cons-of-multithreading)
7. [The Thread Lifecycle](#the-thread-lifecycle)
    1. [New State](#new-state)
    2. [Active State](#active-state)
    3. [Blocked State](#blocked-state)
    4. [Terminated State](#terminated-state)

## Introduction

By default, programming languages are sequential in nature, meaning code execution typically happens line by line. In a single-threaded program, instructions are executed one after the other i.e. sequentially, therefore, Time-consuming sections of code can freeze the entire application. This guide will explore how multithreading can address these issues, and delve into related concepts of concurrency and parallelism.

## Multithreading

Multithreading is the ability of a CPU to perform multiple tasks concurrently. When an application identifies time-consuming tasks that can be run separately, these tasks can be executed in different threads, preventing the entire application from freezing.

## Concurrency vs Parallelism

### Concurrency

Concurrency involves multiple tasks but only one set of hands to handle them, switching between tasks and performing a little of each at a time. It is the ability of a system to execute instructions or tasks almost simultaneously or in a nearly overlapping time, giving the appearance of being executed at the same time. Tasks in a concurrent system start, execute, and complete independently of each other, although they may not be executed exactly at the same time.

*Example: Multitasking - A single processor switching rapidly between multiple tasks using multiple threads or processes.*

### Parallelism

Parallelism involves doing multiple things simultaneously by dividing tasks among different entities. It refers to the simultaneous execution of multiple tasks to achieve faster performance or increased throughput. Tasks are executed at the same time using multiple processors, processor cores, or other means of parallel processing such as distributed computing or GPU computing. Parallelism breaks a task into smaller, unrelated tasks that can be executed concurrently to speed up execution time.

## Process vs Thread

- **Process:** An instance of program execution. When an application starts, it becomes a process, and the operating system assigns it its own stack and heap memory areas.
- **Thread:** A lightweight process, and a unit of execution within a given program. A single process may contain multiple threads, all of which share the memory and resources of the parent process.

## Time Slicing Algorithm

With multiple threads (n threads) associated with a process, the CPU must ensure all threads are given a chance to execute. One approach is the Time Slicing Algorithm, where CPU usage time is shared among different threads.

## Pros and Cons of Multithreading

### Pros
- **Responsive Applications:** Multithreading allows the building of applications that remain responsive, even with time-consuming tasks.
- **Better Resource Utilization:** Prevents CPU idle time by utilizing resources more efficiently.
- **Better Performance:** Can lead to more performant applications through concurrent execution of tasks.

### Cons
- **Synchronization Issues:** Managing synchronization between threads can be tricky since multiple threads need to share the same resources.
- **Complex Testing and Design:** Multithreaded applications are more difficult to design and test due to the complexity of controlling different threads' execution.
- **Expensive Context Switching:** Thread context switching can be expensive if there are more threads than necessary.

*Note: Multithreading is not a one-size-fits-all solution and should be used in relevant contexts.*

## The Thread Lifecycle

### New State
- **Description:** Every thread starts in this state until `start()` is called on it.

### Active State
- **Description:** A thread enters this state once `start()` is called. It has two substates:
  - **Runnable:** Threads waiting for CPU allocation.
  - **Running:** Threads currently being executed by the CPU.

### Blocked State
- **Description:** A thread enters this state when it is waiting for another thread to finish. For example, a thread was executing and, after its CPU time ended, it was blocked while another thread was allocated CPU time.

### Terminated State
- **Description:** A thread reaches this state after completing its required task.
