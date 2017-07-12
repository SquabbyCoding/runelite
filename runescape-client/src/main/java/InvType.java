import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("InvType")
public class InvType extends CacheableNode {
   @ObfuscatedName("i")
   public static IndexDataBase field3285;
   @ObfuscatedName("w")
   static NodeCache field3286;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1962212427
   )
   public int field3287;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(LBuffer;B)V",
      garbageValue = "110"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4272(var1, var2);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(LBuffer;II)V",
      garbageValue = "1875234629"
   )
   void method4272(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field3287 = var1.readUnsignedShort();
      }

   }

   InvType() {
      this.field3287 = 0;
   }

   static {
      field3286 = new NodeCache(64);
   }
}