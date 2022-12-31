const express = require('express');
const router = express.Router();

// Get packages
router.get('/', (req, res, next) => {
  res.status(200).json({
    message: 'Will respond with packages'
  })
});

module.exports = router;
