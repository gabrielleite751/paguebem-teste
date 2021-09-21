import React from "react"
import { Line } from 'react-chartjs-2'
import api from '../services/api'


const BarChart = () => {
  const [revenue, setRevenue] = React.useState();

  React.useEffect(() => {
    api
      .get("/revenues")
      .then((response) => setRevenue(response.data.total))
      .catch((err) => {
        console.error("error" + err);
      });
  }, []);
  
  return (
    <div>
      <Line
        data={{
          labels: ['April', 'May', 'June', 'July', 'August', 'September'],
          datasets: [
            {
              label: 'SALES',
              data: revenue,
              backgroundColor: [
                'rgba(0, 0, 0, 0)',
              ],
              borderColor: [
                'rgb(250, 101, 2)'
              ],
              borderWidth: 2,
            },
          ],
        }}
        height={400}
        width={500}
        options={{
          maintainAspectRatio: false,
          scales: {
            yAxes: [
              {
                ticks: {
                  beginAtZero: true,
                },
              },
            ],
          },
          legend: {
            labels: {
              fontSize: 25,
            },
          },
        }}
      />
    </div>
  )
}

export default BarChart