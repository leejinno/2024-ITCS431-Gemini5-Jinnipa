# Gemini5_D1_Requirements.md
## Functional Requirements
| ID | Requirements |
|-|-|
| F01 | The system shall allow astronomers to create a science plan, specifying targets, observation conditions, and instrument configurations.
| F02 | The system shall provide a virtual telescope for testing and simulating the science plan before submission.
| F03 | The system shall enable the submission of science plans to the observation queue for scheduling.
| F04 | The system shall enable the control of telescope operations, including positioning, focusing, and switching instruments.
| F05 | The system shall support automatic execution of observation programs through a sequencer to minimize manual intervention.
| F06 | The system shall allow switching between observation modes and instruments during the night without disrupting ongoing observations.
| F07 | The system shall provide real-time status updates for telescope operations and environmental conditions (e.g., temperature, humidity)
| F08 | The system shall notify users of any errors or faults detected during operation.
| F09 | The system shall automatically archive observation data into the database upon acquisition.
| F10 | The system shall support retrieval and query of archived data, including historical observation records and calibration datasets.
| F11 | The system shall integrate with astronomical catalogs to assist in identifying and selecting observation targets.
| F12 | The system shall support remote observation, allowing users to access and control the telescope from off-site locations.
| F13 | The system shall provide multi-user access, enabling collaboration among different roles (e.g., astronomers, operators) with appropriate access privileges.
| F14 | The system shall enable multipoint monitoring, allowing remote users to view ongoing observation progress without interfering with operations.
| F15 | The system shall allow dynamic reconfiguration of telescope settings to adapt to changing weather conditions or observation priorities.
| F16 | The system shall permit the integration and validation of new instruments or configurations before deployment.
| F17 | The system shall allow tailored access levels and privileges based on user roles.
| F18 | The system shall retain and operate the core functionality of the existing Observatory Control System (OCS).
| F19 | The system shall define clear workflows for users, including astronomers, science observers, and operational staff, to streamline the observation lifecycle.
| F20 | The system shall address issues such as poor documentation in the legacy system and the offshore development environment​​.
| F21 | The system shall log errors in subsystems and provide traceability for troubleshooting.
| F22 | The system shall grant support staff and developers the highest privileges for maintenance.

## Non-Functional Requirements
| ID | Requirements |
|-|-|
| NF01 | The system shall handle increased load by supporting the addition of more users, instruments, or telescopes without significant performance degradation.
| NF02 | The system shall process observation commands and update telescope positions within 2 seconds to minimize delay.
| NF03 | The system shall handle real-time data streaming from instruments with a throughput of at least 500 MB/s without buffering issues.
| NF04 | The database shall support query response times of less than 1 second for archived data retrieval under normal load.
| NF05 | The user interface shall be intuitive, requiring no more than 2 hours of training for astronomers to operate the system effectively.
| NF06 | The system shall support multi-language interfaces to accommodate users from different regions.
| NF07 | The system shall provide clear visual indicators and notifications for errors, warnings, and system statuses.
| NF08 | The system shall have an availability of 99.9%, ensuring minimal downtime for critical operations.
| NF09 | The system shall ensure data integrity, preventing any loss or corruption during observation, transmission, or storage.
| NF10 | The system shall enforce role-based access control (RBAC) to ensure that only authorized users can access specific features or data.
| NF11 | All communication between remote users and the system shall be encrypted using protocols such as TLS 1.3.
| NF12 | The system shall allow updates to software components without affecting ongoing observations.
| NF13 | System logs shall be accessible for debugging and maintenance, and issues shall be traceable to their source with detailed error logs.
| NF14 | The system shall support deployment on cloud-based infrastructure and on-premise data centers without requiring significant reconfiguration.
| NF15 | The system shall run on operating systems including Linux, macOS, and Windows.
| NF16 | The system shall integrate seamlessly with existing astronomical catalogs and standards such as FITS (Flexible Image Transport System).
| NF17 | The system shall support API integration with external software for additional data analysis or visualization tools.
| NF18 | The system shall dynamically adjust observation schedules based on changes in weather or telescope availability, responding within 5 seconds of receiving updated conditions.
| NF19 | The system shall automatically back up critical data every 5 minutes and provide recovery options to restore operations within 15 minutes of an outage.
| NF20 | The system shall allow for modular expansion, enabling new features or functionality (e.g., integration of future astronomical instruments).
| NF21 | The UI should be intuitive, visually oriented, and user-friendly, even for occasional users.
| NF22 | The system shall update the local status display within 4 seconds under normal operating conditions.
| NF23 | The system shall refresh critical updates, such as telescope position, within a faster time frame.
| NF24 | The system shall respond to subsystem status information requests within 5 seconds, including during maintenance operations.
| NF25 | The system shall perform handshaking between subsystems for commands within 100–200 milliseconds to ensure quick acknowledgment of command receipt.
| NF26 | The system shall support communication timeouts for commands at approximately 500 milliseconds.
| NF27 | The system shall handle a maximum peak of 100 transactions per second (TPS) for control-related information.
| NF28 | The system shall ensure that the internal communication LAN supports a data transfer rate of 20–40 Mbps to facilitate data transfers between workstations and the virtual telescope system.

## Requirement Gathering
https://chatgpt.com/share/67979048-f37c-8008-b165-aca434486abd  <br />
https://chatgpt.com/share/679792dd-5864-8003-ad65-df71347c2722 <br />
https://chatgpt.com/share/679790d8-5a6c-800f-b51b-7552be7b9394 <br />
https://chatgpt.com/share/679799b9-dca4-8011-913e-18adca68e112  <br />

## Group Members
| ID | Name |
|-|-|
| 6588051 | Benjaphol Kositanon
| 6588075 | Sorawit Piriyapanyaporn
| 6588152 | Jinnipa Leepong
| 6588164 | Thonthan Arunyawas
| 6588178 | Nichakul Kongnual
| 6588187 | Punyaporn Putthajaksri
