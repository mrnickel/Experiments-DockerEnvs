package main

import (
	"fmt"
	"os"
)

func main() {
	if os.Getenv("TEST_ENV_ITEM") == "" {
		fmt.Println("Env var does not exist")
	} else {
		fmt.Println(os.Getenv("TEST_ENV_ITEM"))
	}
}
