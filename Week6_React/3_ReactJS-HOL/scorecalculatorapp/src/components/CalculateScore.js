import React from 'react';
import '../stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
  return (decimal.toFixed(2) + '%');
};

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal);
};

const CalculateScore = ({ Name, School, total, goal }) => {
  return (
    <div className="score-card">
      <h1><font color="Brown">Student Details:</font></h1>

      <div className="name">
        <b><span>Name:</span></b>
        <span> {Name}</span>
      </div>

      <div className="school">
        <b><span>School:</span></b>
        <span> {School}</span>
      </div>

      <div className="total">
        <b><span>Total:</span></b>
        <span> {total} Marks</span>
      </div>

      <div className="score">
        <b>Score:</b>
        <span> {calcScore(total, goal)}</span>
      </div>
    </div>
  );
};

export default CalculateScore;
