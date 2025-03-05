# Real-Time Chat Application

## Overview
This is a real-time chat application built using Spring Boot for the backend and WebSocket technology for instant messaging functionality.

## Features
- Real-time messaging
- WebSocket-based communication
- Simple and intuitive user interface
- Instant message broadcasting

## Technology Stack
- Backend: Spring Boot
- WebSocket: STOMP over SockJS
- Frontend: HTML, JavaScript, Bootstrap
- Communication Protocol: WebSocket

## Prerequisites
- Java 11 or higher
- Maven
- Web browser with JavaScript support

## Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/chat/
│   │       ├── model/
│   │       │   └── ChatMessage.java
│   │       ├── controller/
│   │       │   └── ChatController.java
│   │       └── config/
│   │           └── WebSocketConfig.java
│   └── resources/
│       ├── static/
│       │   └── chat.html
│       └── application.properties
```

## Configuration

### WebSocket Configuration
- Endpoint: `/chat`
- Message broker: Simple in-memory broker
- Destination prefix: `/app`

### Application Properties
Key configurations in `application.properties`:
```properties
spring.application.name=chat-app
frontend.url=http://localhost:8080
```

## Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/real-time-chat-app.git
```

2. Navigate to project directory
```bash
cd real-time-chat-app
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

## Usage
1. Open browser and navigate to `http://localhost:8080/chat`
2. Enter your name in the "Your name" field
3. Type a message and click "Send"
4. Messages will be instantly broadcasted to all connected clients

## Key Components
- `ChatMessage.java`: Message model class
- `ChatController.java`: Handles message sending and routing
- `WebSocketConfig.java`: Configures WebSocket settings
- `chat.html`: Frontend HTML and JavaScript for chat interface

## WebSocket Flow
1. Client connects to WebSocket endpoint
2. User sends a message
3. Message is processed by `ChatController`
4. Message is broadcast to all subscribed clients

## Troubleshooting
- Ensure all dependencies are correctly installed
- Check that no other application is running on port 8080
- Verify WebSocket dependencies in `pom.xml`

## Security Considerations
- Current implementation allows connections from all origins
- In production, restrict origin patterns
- Implement authentication for secure messaging

## Potential Improvements
- User authentication
- Persistent message storage
- Private messaging
- Typing indicators
- Message timestamps

## Contributing
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## License
[Specify your license here, e.g., MIT License]

## Contact
[Doston Sulaymon / dostonqosimiy19@gmail.com]
```

## Support
For issues or questions, please open a GitHub issue or contact the maintainer.