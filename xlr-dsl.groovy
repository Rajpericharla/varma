xlr {
    release("Hello world release") {
        description "Hello world release description"
        phases {
            phase {
                title "Sample"
                tasks {
                    manual("Manual task") {
                        description "Manual task description"
                    }
                }
            }
        }
    }
}
