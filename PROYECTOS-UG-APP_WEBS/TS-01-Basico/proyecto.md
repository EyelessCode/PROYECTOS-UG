## Creas un proyecto en Node
`npm init -y`
creas un proyecto y los datos por default, no consulta al programador.

## Instalar TypeScript en modo Developer
`npm install typescript --save-dev`
o también puedes usar
`npm install -D typescript`

`
{
    "compilerOptions":{
        "target": "ES6",
        "module": "ES6",
        "outDir": "./dist",
        "rootDir": "./src",
        "strict": true,
        "esModuleInterop": true,
        "moduleResolution": true,
        "skipLibCheck": true,
        "forceConsistentCasingInFileNames": true
    }
}
`

## Añadir estos Scripts útiles en archivo package.json:

`
{
    "script":{
        "build": "tsc",
        "start": "node dist/index.js",
        "dev": "ts-node dist/index.js",
    }
}
`