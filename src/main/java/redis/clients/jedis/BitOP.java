package redis.clients.jedis;

import redis.clients.util.SafeEncoder;

public enum BitOP {
  AND, OR, XOR, NOT;

  public final byte[] raw;

  private BitOP() {
    this.raw = SafeEncoder.encode(name());
  }
}
