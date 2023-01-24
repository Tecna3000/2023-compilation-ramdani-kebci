/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ADivExp5 extends PExp5
{
    private PExp5 _exp5_;
    private TDiv _div_;
    private PExp6 _exp6_;

    public ADivExp5()
    {
        // Constructor
    }

    public ADivExp5(
        @SuppressWarnings("hiding") PExp5 _exp5_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PExp6 _exp6_)
    {
        // Constructor
        setExp5(_exp5_);

        setDiv(_div_);

        setExp6(_exp6_);

    }

    @Override
    public Object clone()
    {
        return new ADivExp5(
            cloneNode(this._exp5_),
            cloneNode(this._div_),
            cloneNode(this._exp6_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivExp5(this);
    }

    public PExp5 getExp5()
    {
        return this._exp5_;
    }

    public void setExp5(PExp5 node)
    {
        if(this._exp5_ != null)
        {
            this._exp5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp5_ = node;
    }

    public TDiv getDiv()
    {
        return this._div_;
    }

    public void setDiv(TDiv node)
    {
        if(this._div_ != null)
        {
            this._div_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._div_ = node;
    }

    public PExp6 getExp6()
    {
        return this._exp6_;
    }

    public void setExp6(PExp6 node)
    {
        if(this._exp6_ != null)
        {
            this._exp6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp6_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp5_)
            + toString(this._div_)
            + toString(this._exp6_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp5_ == child)
        {
            this._exp5_ = null;
            return;
        }

        if(this._div_ == child)
        {
            this._div_ = null;
            return;
        }

        if(this._exp6_ == child)
        {
            this._exp6_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp5_ == oldChild)
        {
            setExp5((PExp5) newChild);
            return;
        }

        if(this._div_ == oldChild)
        {
            setDiv((TDiv) newChild);
            return;
        }

        if(this._exp6_ == oldChild)
        {
            setExp6((PExp6) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
