﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Efficio.Unity.MessageBus
{
    public interface IMessage
    {
        MessageType GetMessageType { get; }
    }
}