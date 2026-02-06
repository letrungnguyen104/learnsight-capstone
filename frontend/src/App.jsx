import React from 'react'
function App() {
  return (
    <div className="min-h-screen bg-gradient-to-br from-indigo-500 via-purple-500 to-pink-500 flex items-center justify-center p-4">
      <div className="bg-white rounded-2xl shadow-2xl p-10 max-w-lg text-center transform transition hover:scale-105 duration-300">
        <div className="text-6xl mb-6 animate-bounce">
          🚧
        </div>

        <h1 className="text-4xl font-extrabold text-transparent bg-clip-text bg-gradient-to-r from-blue-600 to-purple-600 mb-4">
          Xin Chào!
        </h1>

        <p className="text-gray-600 text-lg mb-8 font-medium">
          Website đang được nhóm mình "xây móng đắp nền".
          <br />
          Chưa có gì để xem đâu, quay lại sau nhé!
        </p>

        <div className="flex justify-center space-x-4">
          <span className="px-4 py-2 bg-blue-100 text-blue-700 rounded-full text-sm font-semibold">
            Java Spring Boot
          </span>
          <span className="px-4 py-2 bg-purple-100 text-purple-700 rounded-full text-sm font-semibold">
            ReactJS
          </span>
          <span className="px-4 py-2 bg-pink-100 text-pink-700 rounded-full text-sm font-semibold">
            Azure AI
          </span>
        </div>
      </div>
    </div>
  )
}

export default App
