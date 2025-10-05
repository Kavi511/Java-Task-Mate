Param(
    [switch]$RunMain = $false,
    [string]$MainClass = 'com.taskorganizer.main.TaskOrganizerApplication'
)

$ErrorActionPreference = 'Stop'

# Change to the script's directory
Set-Location -Path (Split-Path -Parent $MyInvocation.MyCommand.Path)

$outDir = Join-Path -Path 'out/production' -ChildPath 'Personal Task Organizer'

if (Test-Path -Path $outDir) {
    Remove-Item -Recurse -Force -Path $outDir
}
New-Item -ItemType Directory -Force -Path $outDir | Out-Null

# Collect all Java source files
$srcFiles = Get-ChildItem -Path 'src' -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
if (-not $srcFiles -or $srcFiles.Count -eq 0) {
    Write-Error 'No Java source files found under src/'
}

# Compile
& javac -d $outDir $srcFiles
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

Write-Host "Compilation succeeded. Classes in: $outDir"

if ($RunMain) {
    & java -cp $outDir $MainClass
    exit $LASTEXITCODE
}

exit 0


