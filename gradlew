#!/bin/sh
# Wrapper estándar de Gradle. Requiere gradle-wrapper.jar (ver README.md)
DIR="$(cd "$(dirname "$0")" && pwd)"
exec gradle "$@"
