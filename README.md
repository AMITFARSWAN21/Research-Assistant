# Research Assistant

A Spring Boot application that provides an API for processing research-related content, including summarization and topic suggestions, using the Gemini language model. Built with Java, Spring Web, and WebClient for integration with external AI services.

## Features

- Summarize research content using Gemini AI
- Suggest related topics and further reading
- Simple REST API interface

## API Usage

### Endpoint

`POST /api/request/process`

### Request Body

```json
{
  "content": "Your text here",
  "opeartion": "summarize" // or "suggest"
}
